<template>
  <div class="p-5">
    <ul class="overflow-y-auto h-[34rem]">
      <li v-for="friend in getFriends">
        <div class="flex flex-row w-56 h-14 ml-3 mt-2 bg-slate-50">
          <div class="my-auto ml-2">
            <img class="rounded-full container w-10 h-10" src="../../assets/nonimg.jpg" />
          </div>
          <div class="ml-4 my-auto w-full overflow-hidden">
            <div>{{friend.fullname}}</div>
            <div>@{{ friend.username }}</div>
          </div>
        </div>
      </li>
    </ul>
  </div>
</template>

<script>
  /**
  *  ���� �������� ���-�� �� �� ANSII (EN), ��  ������������� ����� ������� ��������� UTF-8
  *  ��� ���������� �������������. ������ ������ ������ �� �����.
  */
  import { mapGetters } from 'vuex';
  export default {
    computed: { ...mapGetters(['getFriends']) },
  }
</script>
