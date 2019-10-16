package com.mindoo.domino.jna.internal.structs.compoundtext;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.List;

import com.mindoo.domino.jna.IAdaptable;
import com.mindoo.domino.jna.internal.structs.BaseStructure;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class NotesCDExt2FieldStruct extends BaseStructure implements IAdaptable {
	// C type : WSIG */
	
	public short Signature; /* ORed with WORDRECORDLENGTH */
	public short Length;    /* (length is inclusive with this struct) */
	   
	/** NPREF_xxx */
	public byte NumSymPref;
	/** NNUMSYM_xxx */
	public byte NumSymFlags;
	public int DecimalSymLength;
	public int MilliSepSymLength;
	public int NegativeSymLength;
	public short MilliGroupSize;
	/**
	 * extra vertical spacing (%)<br>
	 * C type : SWORD
	 */
	public short VerticalSpacing;
	/**
	 * extra horizontal spacing (%)<br>
	 * C type : SWORD
	 */
	public short HorizontalSpacing;
	public short Unused2;
	public short FirstFieldLimitType;
	/** NPREF_xxx */
	public byte CurrencyPref;
	/** NCURFMT_xxx */
	public byte CurrencyType;
	/** NCURFMT_xxx */
	public byte CurrencyFlags;
	public int CurrencySymLength;
	public int ISOCountry;
	/** Hannover Thumbnail support */
	public short ThumbnailImageWidth;
	public short ThumbnailImageHeight;
	public short wThumbnailImageFileNameLength;
	public short wIMOnlineNameFormulaLen;
	/** NPREF_xxx */
	public byte DTPref;
	/** DT_xxx */
	public int DTFlags;
	/** DT_xxx */
	public int DTFlags2;
	/** DT_WFMT_xxx */
	public byte DTDOWFmt;
	/** DT_YFMT_xxx */
	public byte DTYearFmt;
	/** DT_MFMT_xxx */
	public byte DTMonthFmt;
	/** DT_DFMT_xxx */
	public byte DTDayFmt;
	public byte DTDsep1Len;
	public byte DTDsep2Len;
	public byte DTDsep3Len;
	public byte DTTsepLen;
	/** DT_DSHOW_xxx */
	public byte DTDShow;
	/** DT_DSPEC_xxx */
	public byte DTDSpecial;
	/** DT_TSHOW_xxx */
	public byte DTTShow;
	/** TZFMT_xxx */
	public byte DTTZone;
	public int Unused5;
	public byte ECFlags;
	public byte Unused612;
	/** Number of characters if proportional width */
	public short wCharacters;
	/** Input enabled formula. */
	public short wInputEnabledLen;
	/** Instant messageing buddy list group name. */
	public short wIMGroupFormulaLen;
	
	public NotesCDExt2FieldStruct() {
		super();
	}
	
	public static NotesCDExt2FieldStruct newInstance() {
		return AccessController.doPrivileged(new PrivilegedAction<NotesCDExt2FieldStruct>() {

			@Override
			public NotesCDExt2FieldStruct run() {
				return new NotesCDExt2FieldStruct();
			}
		});
	}

	protected List<String> getFieldOrder() {
		return Arrays.asList("Signature", "Length", "NumSymPref", "NumSymFlags", "DecimalSymLength", "MilliSepSymLength", "NegativeSymLength", "MilliGroupSize", "VerticalSpacing", "HorizontalSpacing", "Unused2", "FirstFieldLimitType", "CurrencyPref", "CurrencyType", "CurrencyFlags", "CurrencySymLength", "ISOCountry", "ThumbnailImageWidth", "ThumbnailImageHeight", "wThumbnailImageFileNameLength", "wIMOnlineNameFormulaLen", "DTPref", "DTFlags", "DTFlags2", "DTDOWFmt", "DTYearFmt", "DTMonthFmt", "DTDayFmt", "DTDsep1Len", "DTDsep2Len", "DTDsep3Len", "DTTsepLen", "DTDShow", "DTDSpecial", "DTTShow", "DTTZone", "Unused5", "ECFlags", "Unused612", "wCharacters", "wInputEnabledLen", "wIMGroupFormulaLen");
	}
	
	public NotesCDExt2FieldStruct(Pointer peer) {
		super(peer);
	}

	public static NotesCDExt2FieldStruct newInstance(final Pointer peer) {
		return AccessController.doPrivileged(new PrivilegedAction<NotesCDExt2FieldStruct>() {

			@Override
			public NotesCDExt2FieldStruct run() {
				return new NotesCDExt2FieldStruct(peer);
			}
		});
	}

	public static class ByReference extends NotesCDExt2FieldStruct implements Structure.ByReference {
		
	};
	public static class ByValue extends NotesCDExt2FieldStruct implements Structure.ByValue {
		
	};
	
	@Override
	public <T> T getAdapter(Class<T> clazz) {
		if (clazz == NotesCDExt2FieldStruct.class) {
			return (T) this;
		}
		return null;
	}
}