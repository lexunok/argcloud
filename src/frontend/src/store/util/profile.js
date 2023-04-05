export default {
  mutations: {
    changeToProfileButtons(state) {
      state.profileView = 'ProfileButtons'
    },
    changeToProfileFriends(state) {
      state.profileView = 'ProfileFriend'
    },
    changeToUserSettings(state) {
      state.profileView = 'UserSettings'
    }
  },
  state: {
    profileView: 'ProfileButtons'
  },
  getters: {
    getProfileView(state) {
      return state.profileView
    }
  }
}
