<script setup>
import {Lock, User} from '@element-plus/icons-vue'
import {reactive, ref} from 'vue'
import {login} from '@/net'
import router from "@/router/index.js";

const formRef = ref()

const form = reactive({
  username: '',
  password: '',
  remember: false
})
const rule = {
  username: [
    {required: true, message: '请输入用户名', trigger: 'blur'},
    {min: 3, max: 15, message: '长度在 3 到 15 个字符', trigger: 'blur'}
  ],
  password: [
    {required: true, message: '请输入密码', trigger: 'blur'},
    {min: 6, max: 20, message: '长度在 6 到 20 个字符', trigger: 'blur'}
  ]
}

function userLogin() {
  formRef.value.validate((valid) => {
    if (valid) {
      login(form.username, form.password, form.remember, () => {
        router.push('')
      })
    }
  })
}
</script>

<template>
  <div style="text-align: center;margin: 0 20px">
    <div style="margin-top: 100px">
      <div style="font-size: 30px;font-weight: bold">登 录</div>
      <div style="font-size: 15px;color: gray;margin-top: 25px">---请输入用户名和密码进行登录---</div>
    </div>
    <div style="margin-top: 50px">
      <el-form ref="formRef" :model="form" :rules="rule">
        <el-form-item prop="username">
          <el-input v-model="form.username" maxlength="15" placeholder="用户名/邮箱" type="text">
            <template #prefix>
              <el-icon>
                <User/>
              </el-icon>
            </template>
          </el-input>
        </el-form-item>
        <el-form-item prop="password">
          <el-input v-model="form.password" maxlength="20" placeholder="密码" show-password type="password">
            <template #prefix>
              <el-icon>
                <Lock/>
              </el-icon>
            </template>
          </el-input>
        </el-form-item >
        <el-row>
          <el-col :span="12" style="text-align: left">
            <el-form-item prop="remember">
              <el-checkbox v-model="form.remember" label="记住密码"></el-checkbox>
            </el-form-item>
          </el-col>
          <el-col :span="12" style="text-align: right">
            <el-link>忘记密码？</el-link>
          </el-col>
        </el-row>
      </el-form>
    </div>
    <div style="margin-top: 25px">
      <el-button plain style="width: 270px" type="primary" @click="userLogin()">立 即 登 录</el-button>
    </div>
    <div style="margin-top: 25px">
      <el-link>没有账号？立即注册</el-link>
    </div>
  </div>
</template>

<style scoped>

</style>