export default {
  mutations: {
    changeViewToStartProject(state) {
      state.leftView = 'ProjectList',
      state.rightView = 'Start'
    },
    changeViewToCreateProject(state) {
      state.leftView = 'ProjectList',
      state.rightView = 'CreateProject'
    },
    changeViewToJoinProject(state) {
      state.leftView = 'AllProject',
      state.rightView = 'ProjectJoin'
    },
    changeViewToUserProject(state) {
      state.leftView = 'Members',
      state.rightView = 'UserProject'
    },
},
  state: {
    leftView: 'ProjectList',
    rightView: 'Start'
},
  getters: {
    getLeftView(state) {
      return state.leftView
    },
    getRightView(state) {
      return state.rightView
    }
  }
}
