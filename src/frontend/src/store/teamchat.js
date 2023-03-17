import axios from "axios"

export default {
    actions:{
        async getMessages(ctx){
            const response = await axios.get("https://jsonplaceholder.typicode.com/posts")
            ctx.commit('updateMessages', response.data )
        }
    },
    mutations:{
        updateMessages(state, messages){
            state.messages = messages
        }
    },
    state:{
        messages: []
    },
    getters:{
        allMessages(state){
            return state.messages
        }
    }
    
}