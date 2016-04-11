package com.mindoo.domino.jna.structs;

import java.util.Arrays;
import java.util.List;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class NotesOriginatorId extends Structure {
	/** C type : DBID */
	public NotesTimeDate File;
	/** C type : TIMEDATE */
	public NotesTimeDate Note;
	public int Sequence;
	/** C type : TIMEDATE */
	public NotesTimeDate SequenceTime;
	
	public NotesOriginatorId() {
		super();
	}
	
	protected List<? > getFieldOrder() {
		return Arrays.asList("File", "Note", "Sequence", "SequenceTime");
	}
	
	/**
	 * @param File C type : DBID<br>
	 * @param Note C type : TIMEDATE<br>
	 * @param SequenceTime C type : TIMEDATE
	 */
	public NotesOriginatorId(NotesTimeDate File, NotesTimeDate Note, int Sequence, NotesTimeDate SequenceTime) {
		super();
		this.File = File;
		this.Note = Note;
		this.Sequence = Sequence;
		this.SequenceTime = SequenceTime;
	}
	
	public NotesOriginatorId(Pointer peer) {
		super(peer);
	}
	
	public static class ByReference extends NotesOriginatorId implements Structure.ByReference {
		
	};
	
	public static class ByValue extends NotesOriginatorId implements Structure.ByValue {
		
	};
	
}