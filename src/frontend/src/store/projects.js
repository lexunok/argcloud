import axios from "axios"
export default {
  actions: {
    async setProjects({commit}, id){
      const response = await axios.get("/api/projects/" + id)
      commit('updateAllProject',response.data)
    },
    async createProject({commit,state},{id, name}){
      const response = await axios.post("/api/projects/" + id, { name })
      commit('updateBoolProjects',state.projects)
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
    },
    updateSelectProject(state) {
      if (state.selectProject == false) {
        state.selectProject = true
      }
      else if (state.selectProject == true) {
        state.selectProject = true
      }
    }
  },
  state: {
    haveProjects: false,
    selectProject: false,
    projects: []
  },
  getters: {
    getProjects(state) {
      return state.projects
    },
    getBoolProjects(state) {
      return state.haveProjects
    },
    getBoolSelectProject(state) {
      return state.selectProject
    }
  }
}
