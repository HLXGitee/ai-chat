使用的是阿里云百炼平台的qwen-max-latest模型
项目是前后端分离的，需要启动前后端，启动后在输入框中输入问题回车即可（实现的有流式输出，记忆，由于记忆没有做持久化存储，重新启动项目后记忆会丢失）
前端部分根据后端的接口借助了ai实现

后端api key填写位置在application.yml配置文件，将api-key: ${OPENAI_API_KEY}这里替换为api-key: 您的api key，使用的模型是qwen-max-latest
