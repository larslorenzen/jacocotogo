/**
 * The MIT License
 * Copyright (c) 2013 Matthew C. Jenkins
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package org.helmetsrequired.jacocotogo;

/**
 * An exception which represents an error resulting from user input
 *
 * @author Matthew C. Jenkins 
 */
public class JaCoCoToGoValidationException extends Exception {

    /**
     * <p>Constructor for JaCoCoToGoValidationException.</p>
     *
     * @param message a {@link java.lang.String} object.
     */
    public JaCoCoToGoValidationException(String message) {
        super(message);
    }

    /**
     * <p>Constructor for JaCoCoToGoValidationException.</p>
     *
     * @param message a {@link java.lang.String} object.
     * @param cause a {@link java.lang.Throwable} object.
     */
    public JaCoCoToGoValidationException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * <p>Constructor for JaCoCoToGoValidationException.</p>
     *
     * @param cause a {@link java.lang.Throwable} object.
     */
    public JaCoCoToGoValidationException(Throwable cause) {
        super(cause);
    }
    
}