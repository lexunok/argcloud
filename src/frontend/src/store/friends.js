import axios from "axios"


export default {
    actions:{
        async setFriends({commit}, username){
            const response = await axios.get("/api/friends", { params: { username} })
            commit('updateFriends', response.data )
        },
        async addFriend({commit},{username,friendname}){
            const response = await axios.post("/api/friends",{user:username,friend:friendname})
            commit('addFriendToState',response.data)
        },
        async deleteFriend({commit},{username,friendname}){
            const response = await axios.delete("/api/friends",{data:{user:username,friend:friendname}})
            commit('deleteFriendFromState',response.data)
        }
    },
    mutations:{
        updateFriends(state, friends){
            state.friends = friends
        },
        addFriendToState(state, friend){
            state.friends.unshift(friend)
        },
        deleteFriendFromState(state,friend){
            state.friends = state.friends.filter(user => user.username != friend.username)
        }
    },
    state:{
        friends: []
    },
    getters:{
        getFriends(state){
            return state.friends
        },
    }
    
}