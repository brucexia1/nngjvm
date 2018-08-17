package nng;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : nng.h:77</i><br>
 * This file was autogenerated by <a href="https://github.com/nativelibs4java/JNAerator">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="https://github.com/nativelibs4java">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("nng") 
public class nng_iov extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : void* */
	@Field(0) 
	public Pointer<? > iov_buf() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : void* */
	@Field(0) 
	public nng_iov iov_buf(Pointer<? > iov_buf) {
		this.io.setPointerField(this, 0, iov_buf);
		return this;
	}
	@Field(1) 
	public long iov_len() {
		return this.io.getLongField(this, 1);
	}
	@Field(1) 
	public nng_iov iov_len(long iov_len) {
		this.io.setLongField(this, 1, iov_len);
		return this;
	}
	public nng_iov() {
		super();
	}
	public nng_iov(Pointer pointer) {
		super(pointer);
	}
}
