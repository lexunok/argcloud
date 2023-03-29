import axios from "axios"


export default {
    actions:{
        async setFiles({commit}, id){
            const response = await axios.get("/api/files/all/" + id)
            commit('updateFiles', response.data )
        },
    },
    mutations:{
        updateFiles(state, file){
            state.files = file
        },
        addFileToState(state, file){
            state.files = [...state.files,...file]
        },
    },
    state:{
        files: []
    },
    getters:{
        getFiles(state){
            return state.files
        },
    }
    
}