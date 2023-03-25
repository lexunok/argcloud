/**
  *  ���� �������� ���-�� �� �� ANSII (EN), ��  ������������� ����� ������� ��������� UTF-8
  *  ��� ���������� �������������. ������ ������ ������ �� �����.
  */
export default {
  mutations: {
    updateBoolProjects(state,projects) {
      if (projects != null) {
        state.haveProjects = true
      }
    }
  },
  state: {
    haveProjects: false,
    projects: [
      {
        name: 'проект'
      },
      {
        name: 'да'
      },
      {
        name: 'этоп проект'
      },
      {
        name: 'аргоблако'
      }
    ]
  },
  getters: {
    getProjects(state) {
      return state.projects
    },
    getBoolProjects(state) {
      return state.haveProjects
    }
  }
}
