<template>
  <div>
    <form enctype="multipart/form-data" class="flex flex-col w-[53rem] h-[30.5rem]
          outline-dashed outline-2 outline-violet-700 outline-offset-[-12px] bg-cyan-400"> 
      <div class="relative">
        <input ref="file" @change="sendFile" type="file" multiple class="w-[53rem] h-[30.5rem] opacity-0 absolute">
        <p class="text-center m-32" v-if="!uploading" >Drag files here</p>
        <p class="text-center m-32" v-if="uploading" >Uploading {{ this.progress }}</p>
      </div>
    </form>
    <div>
      <ul v-for="file in uploadedFiles">
        <li>{{ file }}</li>
      </ul>
    </div>
  </div>
</template>
<script>
import axios from 'axios';

  /**
  *  ���� �������� ���-�� �� �� ANSII (EN), ��  ������������� ����� ������� ��������� UTF-8
  *  ��� ���������� �������������. ������ ������ ������ �� �����.
  */
  export default {
    data(){
      return {
        uploadedFiles: [],
        uploading: false,
        progress: 0
      }
    },
    methods: {
      async sendFile(){
        this.uploading = true
        const files = this.$refs.file.files
        const formData = new FormData();
        const arr = Array.from(files)
        arr.forEach( element => {
          formData.append('files', element)});
        const response = await axios.post("/api/files/upload", formData, {
          onUploadProgress: e => this.progress = Math.round(e.loaded * 100 / e.total)
        })
        this.uploadedFiles = [...this.uploadedFiles, ...response.data]
        this.uploading = false
      }
    }
  }
</script>
<style>
</style>
