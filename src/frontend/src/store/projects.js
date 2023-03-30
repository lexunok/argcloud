import axios from "axios"
export default {
  actions: {
    async setProjects({commit}, id){
      const response = await axios.get("/api/projects/" + id)
      commit('updateAllProject',response.data)
    },
    async createProject({commit},{id, name}){
      const response = await axios.post("/api/projects/" + id, {name})
      commit('updateLocalProject',response.data)
    }
  },
  mutations: {
    updateLocalProject(state, project){
      state.projects.push(project)
    },
    updateAllProject(state, projects){
      state.projects = projects
    },
    updateBoolProjects(state,projects) {
      if (projects != null) {
        state.haveProjects = true
      }
    }
  },
  state: {
    haveProjects: false,
    projects: []
  },
  getters: {
    getProjects(state) {
      return state.projects
    },
    getBoolProjects(state) {
      return state.haveProjects
    }
  }
}
