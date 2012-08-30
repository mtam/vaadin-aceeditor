package org.vaadin.aceeditor.gwt.ace;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.DataResource;
import com.google.gwt.resources.client.DataResource.MimeType;

public interface AceModeResources extends ClientBundle {
	AceModeResources INSTANCE = GWT.create(AceModeResources.class);
	
	@Source("aceresources/mode-c_cpp.js")
	@MimeType("application/javascript")
	DataResource c_cpp();
	
	@Source("aceresources/mode-clojure.js")
	@MimeType("application/javascript")
	DataResource clojure();
	
	@Source("aceresources/mode-coffee.js")
	@MimeType("application/javascript")
	DataResource coffee();
	
	@Source("aceresources/mode-coldfusion.js")
	@MimeType("application/javascript")
	DataResource coldfusion();
	
	@Source("aceresources/mode-csharp.js")
	@MimeType("application/javascript")
	DataResource csharp();
	
	@Source("aceresources/mode-css.js")
	@MimeType("application/javascript")
	DataResource css();
	
	@Source("aceresources/mode-groovy.js")
	@MimeType("application/javascript")
	DataResource groovy();
	
	@Source("aceresources/mode-haxe.js")
	@MimeType("application/javascript")
	DataResource haxe();
	
	@Source("aceresources/mode-html.js")
	@MimeType("application/javascript")
	DataResource html();
	
	@Source("aceresources/mode-java.js")
	@MimeType("application/javascript")
	DataResource java();
	
	@Source("aceresources/mode-javascript.js")
	@MimeType("application/javascript")
	DataResource javascript();
	
	@Source("aceresources/mode-json.js")
	@MimeType("application/javascript")
	DataResource json();
	
	@Source("aceresources/mode-latex.js")
	@MimeType("application/javascript")
	DataResource latex();
	
	@Source("aceresources/mode-lua.js")
	@MimeType("application/javascript")
	DataResource lua();
	
	@Source("aceresources/mode-markdown.js")
	@MimeType("application/javascript")
	DataResource markdown();
	
	@Source("aceresources/mode-ocaml.js")
	@MimeType("application/javascript")
	DataResource ocaml();
	
	@Source("aceresources/mode-perl.js")
	@MimeType("application/javascript")
	DataResource perl();
	
	@Source("aceresources/mode-pgsql.js")
	@MimeType("application/javascript")
	DataResource pgsql();
	
	@Source("aceresources/mode-php.js")
	@MimeType("application/javascript")
	DataResource php();
	
	@Source("aceresources/mode-powershell.js")
	@MimeType("application/javascript")
	DataResource powershell();
	
	@Source("aceresources/mode-python.js")
	@MimeType("application/javascript")
	DataResource python();
	
	@Source("aceresources/mode-ruby.js")
	@MimeType("application/javascript")
	DataResource ruby();
	
	@Source("aceresources/mode-scad.js")
	@MimeType("application/javascript")
	DataResource scad();
	
	@Source("aceresources/mode-scala.js")
	@MimeType("application/javascript")
	DataResource scala();
	
	@Source("aceresources/mode-coffee.js")
	@MimeType("application/javascript")
	DataResource scss();
	
	@Source("aceresources/mode-sql.js")
	@MimeType("application/javascript")
	DataResource sql();
	
	@Source("aceresources/mode-svg.js")
	@MimeType("application/javascript")
	DataResource svg();
	
	@Source("aceresources/mode-textile.js")
	@MimeType("application/javascript")
	DataResource textile();
	
	@Source("aceresources/mode-xml.js")
	@MimeType("application/javascript")
	DataResource xml();
	

	
//	@Source("aceresources/worker-javascript.js")
//	@MimeType("application/javascript")
//	DataResource javascriptWorker();
	

	
}
