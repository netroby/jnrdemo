/*
 * This Java source file was auto generated by running 'gradle buildInit --type java-library'
 * by 'huzhifeng' at '6/1/16 11:33 AM' with Gradle 2.13
 *
 * @author huzhifeng, @date 6/1/16 11:33 AM
 */
package Hello; 
import jnr.ffi.LibraryLoader;
public class Hello {
    public static interface LibC {
        int puts(String s);
    }
    public static void main(String[] args) {
        LibC libc = LibraryLoader.create(LibC.class).load("c");
        libc.puts("hello world from jnr");
    }
}

