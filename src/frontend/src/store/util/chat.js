export default {
  mutations: {
    openChatBool(state) {
      state.inChat = true
    }
  },
  state: {
    inChat: false,
    chatView: 'Chat'
  },
  getters: {
    getChatView(state) {
      return state.chatView
    },
    getBoolInChat(state) {
      return state.inChat
    }
  }
}
