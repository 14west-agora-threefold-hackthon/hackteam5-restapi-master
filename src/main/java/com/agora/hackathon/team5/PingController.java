package com.agora.hackathon.team5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Ping Controller for all adapters.
 */
@RestController
public class PingController {


	/**
	 * Gets the {@link ServerStatusResponse} for the server.
	 *
	 * @return the {@link ServerStatusResponse} instance containing information about the server
	 */
	@GetMapping("ping")
	public String ping() {
		return "ping";
	}

}
