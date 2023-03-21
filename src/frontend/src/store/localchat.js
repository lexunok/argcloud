import axios from "axios"

export default {
    actions:{
        async setMessages({commit},chatId){
            commit('updateChatId',chatId)
            const id = chatId
            const response = await axios.get("/api/chat",{params:{id}})
            commit('updateMessages', response.data )
        },
        async sendMessage({commit, state}, {text,sender} ){
            const id = state.chatId
            const response = await axios.post("api/chat", { text, sender }, { params: { id } })
            commit('addMessageToState', response.data )
        },
    },
    mutations:{
        updateMessages(state, messages){
            state.messages = messages
        },
        addMessageToState(state,message){
            state.messages.push(message)
        },
        updateChatId(state, chatId){
            state.chatId = chatId
        },
        updateChatName(state, name){
            state.chatName = name
        }
    },
    state:{
        messages:[],
        chatId: null,
        chatName: ''
    },
    getters:{
        getMessages(state){
            return state.messages
        },
        getChatName(state){
            return state.chatName
        }
    }
    
}