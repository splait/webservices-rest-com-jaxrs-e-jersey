package br.com.alura.loja;

import java.net.URI;
import java.net.URISyntaxException;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.junit.Assert;
import org.junit.Test;

public class ClientTest {

	@Test
	public void testaQueAConexaoComOServidorFunciona() throws URISyntaxException {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(new URI("http://www.mocky.io"));
		String responseContent = target.path("/v2/5acb8a812f00002a00411675").request().get(String.class);
		Assert.assertTrue(responseContent.contains("Guilherme"));
	}
}
