export default {
  mutations: {
    changeToAbout(state) {
      state.projectView = 'About'
    },
    changeToChat(state) {
      state.projectView = 'Chat'
    },
    changeToDesk(state) {
      state.projectView = 'Desk'
    },
    changeToCalendar(state) {
      state.projectView = 'Calendar'
    },
    changeToTools(state) {
      state.projectView = 'Tools'
    },
    changeToNews(state) {
      state.projectView = 'News'
    }
  },
  state: {
    projectView: 'About'
  },
  getters: {
    getProjectView(state) {
      return state.projectView
    }
  }
}
