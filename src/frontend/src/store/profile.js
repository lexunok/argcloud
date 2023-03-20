import axios from "axios"

export default {
    actions:{
        async setUser({commit}, username){
            const response = await axios.get("/api/profile",{params:{username}})
            commit('updateUser', response.data )
        }
    },
    mutations:{
        updateUser(state, user){
            state.user.username = user.username
            state.user.fullname = user.fullname
            state.user.id = user.id
            state.user.email = user.email
        }
    },
    state:{
        user:{
            id: null,
            email: '',
            username: '',
            fullname: ''
        }
    },
    getters:{
        getFullname(state){
            return state.user.fullname
        },
        getUsername(state){
            return state.user.username
        },
        getId(state){
            return state.user.id
        }
    }
    
}