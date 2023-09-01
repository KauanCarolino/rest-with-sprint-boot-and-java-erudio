package br.com.erudio;

public class Greeting{
	
	private final long id;
	private final String content;
	
	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}
	
	public long getIdid() {
		return id;
	}
	
	public String getContent() {
		return content;
	}
}