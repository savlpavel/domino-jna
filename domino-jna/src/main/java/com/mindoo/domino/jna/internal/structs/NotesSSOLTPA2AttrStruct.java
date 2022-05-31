package com.mindoo.domino.jna.internal.structs;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.List;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class NotesSSOLTPA2AttrStruct extends BaseStructure {
	/** C type : MEMHANDLE */
	public int mhSelf;
	/** C type : MEMHANDLE */
	public int mhKey;
	/**
	 * locked pointer to key<br>
	 * C type : char*
	 */
	public Pointer pKey;
	public int dwKeyLength;
	/** C type : MEMHANDLE */
	public int mhValue;
	/**
	 * locked pointer to value<br>
	 * C type : char*
	 */
	public Pointer pValue;
	public int dwValueLength;
	
	/**
	 * struct SSO_LTPA2_ATTR  * pointer<br>
	 * C type : void*
	 */
	public Pointer pNext;
	
	public NotesSSOLTPA2AttrStruct() {
		super();
	}
	
	public static NotesSSOLTPA2AttrStruct newInstance() {
		return AccessController.doPrivileged((PrivilegedAction<NotesSSOLTPA2AttrStruct>) () -> {
			return new NotesSSOLTPA2AttrStruct();
		});
	}

	protected List<String> getFieldOrder() {
		return Arrays.asList("mhSelf", "mhKey", "pKey", "dwKeyLength", "mhValue", "pValue", "dwValueLength", "pNext");
	}
	
	/**
	 * @param mhSelf C type : MEMHANDLE<br>
	 * @param mhKey C type : MEMHANDLE<br>
	 * @param pKey locked pointer to key<br>
	 * C type : char*<br>
	 * @param mhValue C type : MEMHANDLE<br>
	 * @param pValue locked pointer to value<br>
	 * C type : char*<br>
	 * @param pNext struct SSO_LTPA2_ATTR  * pointer<br>
	 * C type : void*
	 */
	public NotesSSOLTPA2AttrStruct(int mhSelf, int mhKey, Pointer pKey, int dwKeyLength, int mhValue, Pointer pValue, int dwValueLength, Pointer pNext) {
		super();
		this.mhSelf = mhSelf;
		this.mhKey = mhKey;
		this.pKey = pKey;
		this.dwKeyLength = dwKeyLength;
		this.mhValue = mhValue;
		this.pValue = pValue;
		this.dwValueLength = dwValueLength;
		this.pNext = pNext;
	}
	public NotesSSOLTPA2AttrStruct(Pointer peer) {
		super(peer);
	}
	
	public static NotesSSOLTPA2AttrStruct newInstance(Pointer peer) {
		return AccessController.doPrivileged((PrivilegedAction<NotesSSOLTPA2AttrStruct>) () -> {
			return new NotesSSOLTPA2AttrStruct(peer);
		});
	}

	public static class ByReference extends NotesSSOLTPA2AttrStruct implements Structure.ByReference {
		
	};
	
	public static NotesSSOLTPA2AttrStruct.ByReference newInstanceByReference() {
		return AccessController.doPrivileged((PrivilegedAction<NotesSSOLTPA2AttrStruct.ByReference>) () -> {
			return new NotesSSOLTPA2AttrStruct.ByReference();
		});
	}

	public static class ByValue extends NotesSSOLTPA2AttrStruct implements Structure.ByValue {
		
	};
}
