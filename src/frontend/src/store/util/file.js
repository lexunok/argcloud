export default {
  mutations: {
    changeInFolderStatus(state) {
      state.inFolder = true
    },
    changeFolderView(state) {
      if (state.folderView == 'Loader') {
        if (state.lastView == 'Card') {
          state.folderView = 'Card'
        }
        else if (state.lastView == 'List') {
          state.folderView = 'List'
        }
      }
      else {
        if (state.folderView == 'Card') {
          state.folderView = 'List',
            state.lastView = 'List'
        }
        else if (state.folderView == 'List') {
          state.folderView = 'Card',
            state.lastView = 'Card'
        }
      }
    },
    changeToLoader(state) {
      state.folderView = 'Loader'
    }
  },
  state: {
    inFolder: false,
    folderView: 'Card',
    lastView: 'Card'
  },
  getters: {
    getBoolInFolder(state) {
      return state.inFolder
    },
    getFolderView(state) {
      return state.folderView
    }
  }
}
