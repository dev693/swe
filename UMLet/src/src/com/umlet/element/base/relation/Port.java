// The UMLet source code is distributed under the terms of the GPL; see license.txt
package com.umlet.element.base.relation;

import java.awt.Rectangle;

@SuppressWarnings("serial")
public class Port extends Rectangle {

	String _string;

	public String getString() {
		return _string;
	}

	public Port(String s, int a, int b, int c, int d) {
		super(a, b, c, d);

		_string = s;

	}
}
