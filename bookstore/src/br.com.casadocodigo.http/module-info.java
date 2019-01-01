module br.com.casadocodigo.http {
	exports br.com.casadocodigo.data;
	requires java.net.http;
	requires transitive br.com.casadocodigo.domain;
}
