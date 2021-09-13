package com.mindoo.domino.jna.internal.handles;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.List;

import com.mindoo.domino.jna.internal.structs.BaseStructure;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;

/**
 * HANDLE on 64 bit systems
 * 
 * @author Karsten Lehmann
 */
public class HANDLE64 extends BaseStructure implements HANDLE {
	public long hdl;
	private boolean disposed;

	/**
	 * @deprecated only public to be used by JNA; use static newInstance method instead to run in AccessController.doPrivileged block
	 */
	@Deprecated
	public HANDLE64() {
		super();
		//set ALIGN to NONE, because the NAMES_LIST structure is directly followed by the usernames and wildcards in memory
		setAlignType(ALIGN_DEFAULT);
	}

	public static HANDLE64 newInstance(long hdl) {
		return AccessController.doPrivileged((PrivilegedAction<HANDLE64>) () -> new HANDLE64(hdl));
	}

	@Override
	public void clear() {
		hdl = 0;
	}

	@Override
	public boolean isDisposed() {
		return disposed;
	}

	@Override
	public void setDisposed() {
		disposed = true;
	}

	@Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("hdl"); //$NON-NLS-1$
	}

	/**
	 * Creates a new instance
	 * 
	 * @param hdl handle value
	 * @deprecated only public to be used by JNA; use static newInstance method instead to run in AccessController.doPrivileged block
	 */
	@Deprecated
	public HANDLE64(long hdl) {
		super();
		setAlignType(ALIGN_DEFAULT);
		this.hdl = hdl;
	}

	/**
	 * @deprecated only public to be used by JNA; use static newInstance method instead to run in AccessController.doPrivileged block
	 * 
	 * @param peer pointer
	 */
	@Deprecated
	public HANDLE64(Pointer peer) {
		super(peer);
		setAlignType(ALIGN_DEFAULT);
	}

	public static HANDLE64 newInstance(final Pointer peer) {
		return AccessController.doPrivileged((PrivilegedAction<HANDLE64>) () -> new HANDLE64(peer));
	}

	public static class ByReference extends HANDLE64 implements Structure.ByReference, HANDLE.ByReference {
		/**
		 * @deprecated only public to be used by JNA; use static newInstance method instead to run in AccessController.doPrivileged block
		 */
		@Deprecated
		public ByReference() {
			super();
		}
		
		/**
		 * @param peer memory pointer
		 * @deprecated only public to be used by JNA; use static newInstance method instead to run in AccessController.doPrivileged block
		 */
		@Deprecated
		public ByReference(Pointer peer) {
			super(peer);
		}
		
		@Override
		public com.mindoo.domino.jna.internal.handles.HANDLE.ByValue getByValue() {
			return AccessController.doPrivileged((PrivilegedAction<com.mindoo.domino.jna.internal.handles.HANDLE.ByValue>) () -> {
				HANDLE64.ByValue byVal = new HANDLE64.ByValue();
				byVal.hdl = this.hdl;
				return byVal;
			});
		}

	};
	
	public static class ByValue extends HANDLE64 implements Structure.ByValue, HANDLE.ByValue {
		/**
		 * @deprecated only public to be used by JNA; use static newInstance method instead to run in AccessController.doPrivileged block
		 */
		@Deprecated
		public ByValue() {
			super();
		}
		
		/**
		 * @param peer memory pointer
		 * @deprecated only public to be used by JNA; use static newInstance method instead to run in AccessController.doPrivileged block
		 */
		@Deprecated
		public ByValue(Pointer peer) {
			super(peer);
		}
	};
	
	@SuppressWarnings("unchecked")
	@Override
	public <T> T getAdapter(Class<T> clazz) {
		if (clazz == HANDLE.class || clazz == HANDLE64.class) {
			return (T) this;
		}
		else if(clazz == Structure.class) {
			return (T)this;
		}
		else if(clazz == Pointer.class) {
			return (T)getPointer();
		}
		
		return null;
	}
	
	@Override
	public boolean isNull() {
		return hdl==0;
	}

	@Override
	public String toString() {
		return MessageFormat.format("HANDLE64 [handle={0}]", hdl); //$NON-NLS-1$
	}

	@Override
	public HANDLE.ByValue getByValue() {
		HANDLE64.ByValue newHdl = new HANDLE64.ByValue();
		newHdl.hdl = this.hdl;
		return newHdl;
	}
	
}
