export default {
  mutations: {
    changeToProfileButtons(state) {
      state.profileView = 'ProfileButtons'
    },
    changeToProfileFriends(state) {
      state.profileView = 'ProfileFriend'
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
