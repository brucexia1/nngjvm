package nng.options;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * short option clustering is *NOT* supported.<br>
 * <i>native declaration : supplemental/util/options.h:11</i><br>
 * This file was autogenerated by <a href="https://github.com/nativelibs4java/JNAerator">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="https://github.com/nativelibs4java">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("options") 
public class nng_optspec extends StructObject {
	static {
		BridJ.register();
	}
	/**
	 * Long style name (may be NULL for short only)<br>
	 * C type : const char*
	 */
	@Field(0) 
	public Pointer<Byte > o_name() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * Long style name (may be NULL for short only)<br>
	 * C type : const char*
	 */
	@Field(0) 
	public nng_optspec o_name(Pointer<Byte > o_name) {
		this.io.setPointerField(this, 0, o_name);
		return this;
	}
	/** Short option (no clustering!) */
	@Field(1) 
	public int o_short() {
		return this.io.getIntField(this, 1);
	}
	/** Short option (no clustering!) */
	@Field(1) 
	public nng_optspec o_short(int o_short) {
		this.io.setIntField(this, 1, o_short);
		return this;
	}
	/** Value stored on a good parse (>0) */
	@Field(2) 
	public int o_val() {
		return this.io.getIntField(this, 2);
	}
	/** Value stored on a good parse (>0) */
	@Field(2) 
	public nng_optspec o_val(int o_val) {
		this.io.setIntField(this, 2, o_val);
		return this;
	}
	/** Option takes an argument if true */
	@Field(3) 
	public boolean o_arg() {
		return this.io.getBooleanField(this, 3);
	}
	/** Option takes an argument if true */
	@Field(3) 
	public nng_optspec o_arg(boolean o_arg) {
		this.io.setBooleanField(this, 3, o_arg);
		return this;
	}
	public nng_optspec() {
		super();
	}
	public nng_optspec(Pointer pointer) {
		super(pointer);
	}
}