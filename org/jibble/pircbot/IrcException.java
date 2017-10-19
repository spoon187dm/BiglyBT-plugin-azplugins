/* 
Copyright Paul James Mutton, 2001-2004, http://www.jibble.org/

This file is part of PircBot.

This software is dual-licensed, allowing you to choose between the GNU
General Public License (GPL) and the www.jibble.org Commercial License.
Since the GPL may be too restrictive for use in a proprietary application,
a commercial license is also provided. Full license information can be
found at http://www.jibble.org/licenses/

$Author: gouss $
$Id: IrcException.java,v 1.2 2006-01-26 01:24:37 gouss Exp $

*/


package org.jibble.pircbot;

/**
 * An IrcException class.
 *
 * @since   0.9
 * @author  Paul James Mutton,
 *          <a href="http://www.jibble.org/">http://www.jibble.org/</a>
 * @version    1.4.4 (Build time: Tue Mar 29 20:58:46 2005)
 */
public class IrcException extends Exception {
    
	static final long serialVersionUID = 0;
    /**
     * Constructs a new IrcException.
     *
     * @param e The error message to report.
     */
    public IrcException(String e) {
        super(e);
    }
    
}