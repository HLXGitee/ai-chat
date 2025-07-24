package com.hlx.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.MessageChatMemoryAdvisor;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChatConfiguration {

	@Bean
	public ChatClient chatClient(OpenAiChatModel model, ChatMemory chatMemory){
		return ChatClient.builder(model)
				.defaultSystem("你的名字是小张，请以小张的身份回复的用户的问题。")
				.defaultAdvisors(MessageChatMemoryAdvisor.builder(chatMemory).build())
				.build();
	}
}
