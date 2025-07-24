package com.hlx.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/ai")
public class ChatController {
	@Autowired
	private ChatClient chatClient;

	/**
	 * 流式输出模型结果
	 * @param prompt
	 * @return
	 */
	@GetMapping(value = "/chat", produces = "text/html; charset=utf-8")
	public Flux<String> chat(String prompt) {
		// 调用模型
		return chatClient
				.prompt()
				.user(prompt)
				.stream()
				.content();
	}
}
