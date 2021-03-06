/* The following code was generated by JFlex 1.4.1 on 4/5/17 6:47 PM */

/*
 * Copyright 2008 Ayman Al-Sairafi ayman.alsairafi@gmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License
 *       at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/*
 * Copyright 2006 Arnout Engelen <arnouten[remove] at bzzt dot net>.
 * Copyright 2000-2006 Omnicore Software, Hans Kratz & Dennis Strein GbR,
 *                     Geert Bevin <gbevin[remove] at uwyn dot com>.
 * Distributed under the terms of either:
 * - the common development and distribution license (CDDL), v1.0; or
 * - the GNU Lesser General Public License, v2.1 or later
 */
package jsyntaxpane.lexers;

import jsyntaxpane.DefaultLexer;
import jsyntaxpane.Token;
import jsyntaxpane.TokenType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.1
 * on 4/5/17 6:47 PM from the specification file
 * <tt>/Users/allwefantasy/jsyntaxpane/src/main/jflex/jsyntaxpane/lexers/c.flex</tt>
 */
public final class CLexer extends DefaultLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\11\1\3\1\2\1\0\1\3\1\1\16\11\4\0\1\3\1\67"+
    "\1\56\1\6\1\7\1\67\1\67\1\60\1\61\1\62\1\5\1\34"+
    "\1\67\1\34\1\31\1\4\1\14\7\21\2\12\1\67\1\67\1\71"+
    "\1\67\1\70\1\67\1\0\3\20\1\27\1\33\1\27\5\13\1\25"+
    "\10\13\1\23\2\13\1\16\2\13\1\65\1\57\1\66\1\67\1\10"+
    "\1\0\1\37\1\35\1\17\1\30\1\32\1\26\1\47\1\43\1\46"+
    "\1\7\1\40\1\24\1\50\1\45\1\44\1\54\1\7\1\36\1\41"+
    "\1\42\1\22\1\55\1\53\1\15\1\51\1\52\1\63\1\67\1\64"+
    "\1\67\41\11\2\0\4\7\4\0\1\7\2\0\1\11\7\0\1\7"+
    "\4\0\1\7\5\0\27\7\1\0\37\7\1\0\u01ca\7\4\0\14\7"+
    "\16\0\5\7\7\0\1\7\1\0\1\7\21\0\160\11\5\7\1\0"+
    "\2\7\2\0\4\7\10\0\1\7\1\0\3\7\1\0\1\7\1\0"+
    "\24\7\1\0\123\7\1\0\213\7\1\0\5\11\2\0\236\7\11\0"+
    "\46\7\2\0\1\7\7\0\47\7\11\0\55\11\1\0\1\11\1\0"+
    "\2\11\1\0\2\11\1\0\1\11\10\0\33\7\5\0\3\7\15\0"+
    "\4\11\7\0\1\7\4\0\13\11\5\0\53\7\37\11\4\0\2\7"+
    "\1\11\143\7\1\0\1\7\10\11\1\0\6\11\2\7\2\11\1\0"+
    "\4\11\2\7\12\11\3\7\2\0\1\7\17\0\1\11\1\7\1\11"+
    "\36\7\33\11\2\0\131\7\13\11\1\7\16\0\12\11\41\7\11\11"+
    "\2\7\4\0\1\7\5\0\26\7\4\11\1\7\11\11\1\7\3\11"+
    "\1\7\5\11\22\0\31\7\3\11\244\0\4\11\66\7\3\11\1\7"+
    "\22\11\1\7\7\11\12\7\2\11\2\0\12\11\1\0\7\7\1\0"+
    "\7\7\1\0\3\11\1\0\10\7\2\0\2\7\2\0\26\7\1\0"+
    "\7\7\1\0\1\7\3\0\4\7\2\0\1\11\1\7\7\11\2\0"+
    "\2\11\2\0\3\11\1\7\10\0\1\11\4\0\2\7\1\0\3\7"+
    "\2\11\2\0\12\11\4\7\7\0\1\7\5\0\3\11\1\0\6\7"+
    "\4\0\2\7\2\0\26\7\1\0\7\7\1\0\2\7\1\0\2\7"+
    "\1\0\2\7\2\0\1\11\1\0\5\11\4\0\2\11\2\0\3\11"+
    "\3\0\1\11\7\0\4\7\1\0\1\7\7\0\14\11\3\7\1\11"+
    "\13\0\3\11\1\0\11\7\1\0\3\7\1\0\26\7\1\0\7\7"+
    "\1\0\2\7\1\0\5\7\2\0\1\11\1\7\10\11\1\0\3\11"+
    "\1\0\3\11\2\0\1\7\17\0\2\7\2\11\2\0\12\11\1\0"+
    "\1\7\17\0\3\11\1\0\10\7\2\0\2\7\2\0\26\7\1\0"+
    "\7\7\1\0\2\7\1\0\5\7\2\0\1\11\1\7\7\11\2\0"+
    "\2\11\2\0\3\11\10\0\2\11\4\0\2\7\1\0\3\7\2\11"+
    "\2\0\12\11\1\0\1\7\20\0\1\11\1\7\1\0\6\7\3\0"+
    "\3\7\1\0\4\7\3\0\2\7\1\0\1\7\1\0\2\7\3\0"+
    "\2\7\3\0\3\7\3\0\14\7\4\0\5\11\3\0\3\11\1\0"+
    "\4\11\2\0\1\7\6\0\1\11\16\0\12\11\11\0\1\7\7\0"+
    "\3\11\1\0\10\7\1\0\3\7\1\0\27\7\1\0\12\7\1\0"+
    "\5\7\3\0\1\7\7\11\1\0\3\11\1\0\4\11\7\0\2\11"+
    "\1\0\2\7\6\0\2\7\2\11\2\0\12\11\22\0\2\11\1\0"+
    "\10\7\1\0\3\7\1\0\27\7\1\0\12\7\1\0\5\7\2\0"+
    "\1\11\1\7\7\11\1\0\3\11\1\0\4\11\7\0\2\11\7\0"+
    "\1\7\1\0\2\7\2\11\2\0\12\11\1\0\2\7\17\0\2\11"+
    "\1\0\10\7\1\0\3\7\1\0\51\7\2\0\1\7\7\11\1\0"+
    "\3\11\1\0\4\11\1\7\10\0\1\11\10\0\2\7\2\11\2\0"+
    "\12\11\12\0\6\7\2\0\2\11\1\0\22\7\3\0\30\7\1\0"+
    "\11\7\1\0\1\7\2\0\7\7\3\0\1\11\4\0\6\11\1\0"+
    "\1\11\1\0\10\11\22\0\2\11\15\0\60\7\1\11\2\7\7\11"+
    "\4\0\10\7\10\11\1\0\12\11\47\0\2\7\1\0\1\7\2\0"+
    "\2\7\1\0\1\7\2\0\1\7\6\0\4\7\1\0\7\7\1\0"+
    "\3\7\1\0\1\7\1\0\1\7\2\0\2\7\1\0\4\7\1\11"+
    "\2\7\6\11\1\0\2\11\1\7\2\0\5\7\1\0\1\7\1\0"+
    "\6\11\2\0\12\11\2\0\2\7\42\0\1\7\27\0\2\11\6\0"+
    "\12\11\13\0\1\11\1\0\1\11\1\0\1\11\4\0\2\11\10\7"+
    "\1\0\44\7\4\0\24\11\1\0\2\11\5\7\13\11\1\0\44\11"+
    "\11\0\1\11\71\0\53\7\24\11\1\7\12\11\6\0\6\7\4\11"+
    "\4\7\3\11\1\7\3\11\2\7\7\11\3\7\4\11\15\7\14\11"+
    "\1\7\17\11\2\0\46\7\12\0\53\7\1\0\1\7\3\0\u0149\7"+
    "\1\0\4\7\2\0\7\7\1\0\1\7\1\0\4\7\2\0\51\7"+
    "\1\0\4\7\2\0\41\7\1\0\4\7\2\0\7\7\1\0\1\7"+
    "\1\0\4\7\2\0\17\7\1\0\71\7\1\0\4\7\2\0\103\7"+
    "\2\0\3\11\40\0\20\7\20\0\125\7\14\0\u026c\7\2\0\21\7"+
    "\1\0\32\7\5\0\113\7\3\0\3\7\17\0\15\7\1\0\4\7"+
    "\3\11\13\0\22\7\3\11\13\0\22\7\2\11\14\0\15\7\1\0"+
    "\3\7\1\0\2\11\14\0\64\7\40\11\3\0\1\7\3\0\2\7"+
    "\1\11\2\0\12\11\41\0\3\11\2\0\12\11\6\0\130\7\10\0"+
    "\51\7\1\11\1\7\5\0\106\7\12\0\35\7\3\0\14\11\4\0"+
    "\14\11\12\0\12\11\36\7\2\0\5\7\13\0\54\7\4\0\21\11"+
    "\7\7\2\11\6\0\12\11\46\0\27\7\5\11\4\0\65\7\12\11"+
    "\1\0\35\11\2\0\13\11\6\0\12\11\15\0\1\7\130\0\5\11"+
    "\57\7\21\11\7\7\4\0\12\11\21\0\11\11\14\0\3\11\36\7"+
    "\12\11\3\0\2\7\12\11\6\0\46\7\16\11\14\0\44\7\24\11"+
    "\10\0\12\11\3\0\3\7\12\11\44\7\122\0\3\11\1\0\25\11"+
    "\4\7\1\11\4\7\1\11\15\0\300\7\47\11\25\0\4\11\u0116\7"+
    "\2\0\6\7\2\0\46\7\2\0\6\7\2\0\10\7\1\0\1\7"+
    "\1\0\1\7\1\0\1\7\1\0\37\7\2\0\65\7\1\0\7\7"+
    "\1\0\1\7\3\0\3\7\1\0\7\7\3\0\4\7\2\0\6\7"+
    "\4\0\15\7\5\0\3\7\1\0\7\7\16\0\5\11\32\0\5\11"+
    "\20\0\2\7\23\0\1\7\13\0\5\11\5\0\6\11\1\0\1\7"+
    "\15\0\1\7\20\0\15\7\3\0\32\7\26\0\15\11\4\0\1\11"+
    "\3\0\14\11\21\0\1\7\4\0\1\7\2\0\12\7\1\0\1\7"+
    "\3\0\5\7\6\0\1\7\1\0\1\7\1\0\1\7\1\0\4\7"+
    "\1\0\13\7\2\0\4\7\5\0\5\7\4\0\1\7\21\0\51\7"+
    "\u0a77\0\57\7\1\0\57\7\1\0\205\7\6\0\4\7\3\11\16\0"+
    "\46\7\12\0\66\7\11\0\1\7\17\0\1\11\27\7\11\0\7\7"+
    "\1\0\7\7\1\0\7\7\1\0\7\7\1\0\7\7\1\0\7\7"+
    "\1\0\7\7\1\0\7\7\1\0\40\11\57\0\1\7\u01d5\0\3\7"+
    "\31\0\11\7\6\11\1\0\5\7\2\0\5\7\4\0\126\7\2\0"+
    "\2\11\2\0\3\7\1\0\132\7\1\0\4\7\5\0\51\7\3\0"+
    "\136\7\21\0\33\7\65\0\20\7\u0200\0\u19b6\7\112\0\u51cc\7\64\0"+
    "\u048d\7\103\0\56\7\2\0\u010d\7\3\0\20\7\12\11\2\7\24\0"+
    "\57\7\1\11\14\0\2\11\1\0\31\7\10\0\120\7\2\11\45\0"+
    "\11\7\2\0\147\7\2\0\4\7\1\0\2\7\16\0\12\7\120\0"+
    "\10\7\1\11\3\7\1\11\4\7\1\11\27\7\5\11\20\0\1\7"+
    "\7\0\64\7\14\0\2\11\62\7\21\11\13\0\12\11\6\0\22\11"+
    "\6\7\3\0\1\7\4\0\12\11\34\7\10\11\2\0\27\7\15\11"+
    "\14\0\35\7\3\0\4\11\57\7\16\11\16\0\1\7\12\11\46\0"+
    "\51\7\16\11\11\0\3\7\1\11\10\7\2\11\2\0\12\11\6\0"+
    "\27\7\3\0\1\7\1\11\4\0\60\7\1\11\1\7\3\11\2\7"+
    "\2\11\5\7\2\11\1\7\1\11\1\7\30\0\3\7\43\0\6\7"+
    "\2\0\6\7\2\0\6\7\11\0\7\7\1\0\7\7\221\0\43\7"+
    "\10\11\1\0\2\11\2\0\12\11\6\0\u2ba4\7\14\0\27\7\4\0"+
    "\61\7\u2104\0\u012e\7\2\0\76\7\2\0\152\7\46\0\7\7\14\0"+
    "\5\7\5\0\1\7\1\11\12\7\1\0\15\7\1\0\5\7\1\0"+
    "\1\7\1\0\2\7\1\0\2\7\1\0\154\7\41\0\u016b\7\22\0"+
    "\100\7\2\0\66\7\50\0\15\7\3\0\20\11\20\0\7\11\14\0"+
    "\2\7\30\0\3\7\31\0\1\7\6\0\5\7\1\0\207\7\2\0"+
    "\1\11\4\0\1\7\13\0\12\11\7\0\32\7\4\0\1\7\1\0"+
    "\32\7\13\0\131\7\3\0\6\7\2\0\6\7\2\0\6\7\2\0"+
    "\3\7\3\0\2\7\3\0\2\7\22\0\3\11\4\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\3\2\2\3\3\2\2\4\5\2\1\3"+
    "\13\2\2\1\1\5\1\6\1\7\1\10\1\11\1\12"+
    "\2\3\1\13\1\0\1\2\6\0\7\4\1\0\1\2"+
    "\4\4\13\2\1\14\21\2\1\14\7\2\1\0\1\15"+
    "\3\0\2\13\11\0\1\16\3\0\1\4\1\0\1\4"+
    "\43\2\1\17\7\2\12\0\24\2\1\4\10\2\1\0"+
    "\1\16\4\0\16\2\3\0\4\2\1\17\5\2";

  private static int [] zzUnpackAction() {
    int [] result = new int[236];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\72\0\164\0\72\0\256\0\350\0\72\0\u0122"+
    "\0\u015c\0\u0196\0\u01d0\0\u020a\0\u0244\0\u027e\0\u02b8\0\u02f2"+
    "\0\u032c\0\u0366\0\u03a0\0\u03da\0\u0414\0\u044e\0\u0488\0\u04c2"+
    "\0\u04fc\0\u0536\0\u0570\0\u05aa\0\u05e4\0\u061e\0\u0658\0\72"+
    "\0\72\0\72\0\72\0\72\0\72\0\u0692\0\u06cc\0\u0706"+
    "\0\u0740\0\u077a\0\u07b4\0\u07ee\0\u0828\0\u0862\0\u089c\0\u08d6"+
    "\0\u0910\0\u094a\0\u0984\0\u09be\0\72\0\u077a\0\u09f8\0\u0a32"+
    "\0\u0a6c\0\u0aa6\0\u0ae0\0\u0b1a\0\u0b54\0\u0b8e\0\u0bc8\0\u0c02"+
    "\0\u0c3c\0\u0c76\0\u0cb0\0\u0cea\0\u0d24\0\u0d5e\0\u0d98\0\u0dd2"+
    "\0\u0e0c\0\u0e46\0\u0e80\0\u0eba\0\u0ef4\0\u0f2e\0\u0f68\0\u0fa2"+
    "\0\u0fdc\0\u1016\0\u1050\0\u108a\0\u10c4\0\u10fe\0\u1138\0\u1172"+
    "\0\u11ac\0\u11e6\0\u015c\0\u1220\0\u125a\0\u1294\0\u12ce\0\u1308"+
    "\0\u1342\0\u137c\0\u061e\0\72\0\u13b6\0\u0658\0\u13f0\0\u142a"+
    "\0\72\0\u1464\0\u149e\0\u14d8\0\u1512\0\u154c\0\u1586\0\u15c0"+
    "\0\u15fa\0\u1634\0\u166e\0\u16a8\0\u16e2\0\u171c\0\u1756\0\u1790"+
    "\0\u17ca\0\u1804\0\u183e\0\u1878\0\u18b2\0\u18ec\0\u1926\0\u1960"+
    "\0\u199a\0\u19d4\0\u1a0e\0\u1a48\0\u1a82\0\u1abc\0\u1af6\0\u1b30"+
    "\0\u1b6a\0\u1ba4\0\u1bde\0\u1c18\0\u1c52\0\u1c8c\0\u1cc6\0\u1d00"+
    "\0\u1d3a\0\u1d74\0\u1dae\0\u1de8\0\u1e22\0\u1e5c\0\u1e96\0\u1ed0"+
    "\0\u1f0a\0\u1f44\0\u1f7e\0\u1fb8\0\u015c\0\u1ff2\0\u202c\0\u2066"+
    "\0\u20a0\0\u20da\0\u2114\0\u214e\0\u2188\0\u21c2\0\u21fc\0\u2236"+
    "\0\u2270\0\u22aa\0\u22e4\0\u231e\0\u2358\0\u2392\0\u23cc\0\u2406"+
    "\0\u2440\0\u247a\0\u24b4\0\u24ee\0\u2528\0\u2562\0\u259c\0\u25d6"+
    "\0\u2610\0\u264a\0\u2684\0\u26be\0\u26f8\0\u2732\0\u276c\0\u27a6"+
    "\0\u27e0\0\u281a\0\u015c\0\u2854\0\u288e\0\u28c8\0\u2902\0\u293c"+
    "\0\u2976\0\u29b0\0\u29ea\0\u2a24\0\72\0\u2a5e\0\u2a98\0\u2ad2"+
    "\0\u2b0c\0\u2b46\0\u2b80\0\u2bba\0\u2bf4\0\u2c2e\0\u2c68\0\u2ca2"+
    "\0\u2cdc\0\u2d16\0\u2d50\0\u2d8a\0\u2dc4\0\u2dfe\0\u2e38\0\u2e72"+
    "\0\u2eac\0\u2ee6\0\u2f20\0\u2f5a\0\u2f94\0\u2fce\0\u3008\0\u3042"+
    "\0\u307c\0\u30b6\0\u30f0\0\u312a";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[236];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\2\1\13\1\12\1\14\1\11\1\12\1\15"+
    "\1\12\1\13\1\16\1\12\1\17\1\12\1\20\1\12"+
    "\1\21\1\22\1\23\1\12\1\7\1\24\1\25\2\11"+
    "\1\26\1\27\2\11\1\30\1\31\1\32\1\33\2\11"+
    "\1\34\1\11\1\35\1\36\1\2\1\37\1\40\1\41"+
    "\1\42\1\43\1\44\1\45\1\7\1\46\1\47\74\0"+
    "\1\4\72\0\1\5\72\0\1\50\1\51\72\0\1\52"+
    "\1\0\1\52\1\0\3\52\1\0\1\52\1\0\2\52"+
    "\1\53\1\52\1\54\1\52\1\0\1\52\1\55\1\0"+
    "\1\56\1\52\12\0\1\57\5\0\1\60\24\0\22\11"+
    "\1\0\2\11\1\0\21\11\22\0\1\52\1\11\1\12"+
    "\1\11\3\12\1\11\1\12\1\11\2\12\1\11\1\12"+
    "\1\11\1\12\1\11\1\12\1\11\1\0\1\11\1\12"+
    "\1\0\21\11\22\0\1\52\1\0\1\52\1\0\1\13"+
    "\1\52\1\13\1\0\1\52\1\0\1\52\1\13\1\61"+
    "\1\62\1\63\1\64\1\65\1\66\1\65\1\67\1\70"+
    "\1\71\44\0\1\52\1\0\1\52\1\0\1\72\1\52"+
    "\1\73\1\74\1\75\1\0\1\52\1\73\1\61\1\62"+
    "\1\63\1\64\1\65\1\66\1\65\1\67\1\70\1\71"+
    "\45\0\22\11\1\0\2\11\1\0\2\11\1\76\3\11"+
    "\1\77\1\100\11\11\23\0\13\11\1\101\6\11\1\0"+
    "\2\11\1\0\4\11\1\102\3\11\1\103\10\11\23\0"+
    "\22\11\1\0\2\11\1\0\7\11\1\104\11\11\23\0"+
    "\15\11\1\105\4\11\1\0\2\11\1\0\2\11\1\106"+
    "\4\11\1\107\11\11\23\0\22\11\1\0\1\110\1\11"+
    "\1\0\7\11\1\111\11\11\26\0\1\67\1\0\1\67"+
    "\4\0\1\67\57\0\6\11\1\112\6\11\1\113\4\11"+
    "\1\0\2\11\1\0\10\11\1\114\10\11\23\0\22\11"+
    "\1\0\2\11\1\0\1\11\1\115\5\11\1\116\11\11"+
    "\23\0\22\11\1\0\1\117\1\11\1\0\21\11\23\0"+
    "\22\11\1\0\1\120\1\11\1\0\2\11\1\121\2\11"+
    "\1\122\1\123\2\11\1\124\4\11\1\125\2\11\23\0"+
    "\22\11\1\0\1\126\1\11\1\0\1\11\1\127\4\11"+
    "\1\130\5\11\1\131\4\11\23\0\22\11\1\0\2\11"+
    "\1\0\7\11\1\132\11\11\23\0\17\11\1\133\2\11"+
    "\1\0\2\11\1\0\10\11\1\134\10\11\23\0\22\11"+
    "\1\0\2\11\1\0\7\11\1\135\11\11\23\0\13\11"+
    "\1\136\6\11\1\0\2\11\1\0\21\11\23\0\22\11"+
    "\1\0\2\11\1\0\6\11\1\137\12\11\23\0\22\11"+
    "\1\0\2\11\1\0\2\11\1\140\4\11\1\141\1\11"+
    "\1\142\7\11\14\0\2\143\1\144\53\143\1\144\1\145"+
    "\12\143\2\146\1\144\54\146\1\147\1\144\11\146\70\0"+
    "\1\7\72\0\1\7\1\50\1\150\1\151\67\50\5\152"+
    "\1\153\64\152\6\0\1\52\1\0\1\52\1\0\3\52"+
    "\1\0\1\52\1\0\2\52\1\0\1\52\1\0\1\52"+
    "\1\0\1\52\3\0\1\52\77\0\1\154\3\0\1\155"+
    "\72\0\1\156\55\0\1\157\63\0\1\160\11\0\1\161"+
    "\6\0\1\162\52\0\1\163\16\0\1\164\2\0\1\165"+
    "\57\0\1\166\55\0\2\65\2\63\52\0\1\52\1\0"+
    "\1\52\1\0\3\52\1\0\1\52\1\0\2\52\1\65"+
    "\1\66\1\63\1\64\1\0\1\52\3\0\1\52\60\0"+
    "\2\65\54\0\1\52\1\0\1\52\1\0\3\52\1\0"+
    "\1\52\1\0\2\52\1\65\1\66\1\0\1\52\1\0"+
    "\1\52\3\0\1\52\50\0\1\67\1\0\1\67\4\0"+
    "\1\67\4\0\3\65\1\0\2\70\50\0\1\167\1\0"+
    "\1\167\4\0\1\167\12\0\1\170\43\0\1\52\1\0"+
    "\1\52\1\0\1\171\1\52\1\171\1\0\1\52\1\0"+
    "\1\52\1\171\1\0\1\52\1\0\1\52\1\0\1\52"+
    "\3\0\1\52\1\170\43\0\1\52\1\0\1\52\1\0"+
    "\1\72\1\52\1\72\1\0\1\52\1\0\1\52\1\72"+
    "\1\0\1\52\1\0\1\52\1\65\1\66\1\65\1\67"+
    "\1\70\1\71\44\0\1\52\1\0\1\52\1\0\1\72"+
    "\1\52\1\73\1\0\1\52\1\0\1\52\1\73\1\61"+
    "\1\62\1\63\1\64\1\65\1\66\1\65\1\67\1\70"+
    "\1\71\50\0\1\74\1\0\1\74\2\0\3\74\2\61"+
    "\2\63\3\74\1\0\2\74\1\0\1\74\1\0\1\74"+
    "\40\0\1\52\1\0\1\52\1\0\1\75\1\52\1\75"+
    "\1\0\1\52\1\74\2\75\1\61\1\62\1\63\1\64"+
    "\1\74\1\75\1\74\1\0\1\74\1\75\1\0\1\74"+
    "\1\0\1\74\41\0\22\11\1\0\2\11\1\0\4\11"+
    "\1\172\1\173\13\11\23\0\22\11\1\0\2\11\1\0"+
    "\2\11\1\174\16\11\23\0\22\11\1\0\2\11\1\0"+
    "\10\11\1\175\10\11\23\0\22\11\1\0\2\11\1\0"+
    "\11\11\1\176\7\11\23\0\22\11\1\0\2\11\1\0"+
    "\11\11\1\177\7\11\23\0\22\11\1\0\2\11\1\0"+
    "\4\11\1\200\4\11\1\201\7\11\23\0\22\11\1\0"+
    "\2\11\1\0\10\11\1\202\10\11\23\0\22\11\1\0"+
    "\2\11\1\0\7\11\1\203\11\11\23\0\15\11\1\204"+
    "\4\11\1\0\2\11\1\0\21\11\23\0\22\11\1\0"+
    "\2\11\1\0\1\11\1\133\17\11\23\0\17\11\1\205"+
    "\2\11\1\0\2\11\1\0\21\11\23\0\13\11\1\206"+
    "\6\11\1\0\2\11\1\0\21\11\23\0\22\11\1\0"+
    "\2\11\1\0\5\11\1\207\13\11\23\0\22\11\1\0"+
    "\2\11\1\0\4\11\1\172\14\11\23\0\13\11\1\210"+
    "\6\11\1\0\2\11\1\0\21\11\23\0\22\11\1\0"+
    "\1\211\1\11\1\0\21\11\23\0\22\11\1\0\2\11"+
    "\1\0\7\11\1\212\11\11\23\0\22\11\1\0\2\11"+
    "\1\0\5\11\1\213\4\11\1\214\6\11\23\0\15\11"+
    "\1\215\4\11\1\0\2\11\1\0\2\11\1\216\16\11"+
    "\23\0\17\11\1\217\2\11\1\0\2\11\1\0\21\11"+
    "\23\0\22\11\1\0\2\11\1\0\1\11\1\220\1\221"+
    "\16\11\23\0\22\11\1\0\2\11\1\0\7\11\1\222"+
    "\11\11\23\0\22\11\1\0\2\11\1\0\12\11\1\223"+
    "\2\11\1\224\3\11\23\0\22\11\1\0\2\11\1\0"+
    "\11\11\1\225\7\11\23\0\22\11\1\0\2\11\1\0"+
    "\13\11\1\226\5\11\23\0\13\11\1\227\6\11\1\0"+
    "\2\11\1\0\14\11\1\133\4\11\23\0\22\11\1\0"+
    "\2\11\1\0\1\11\1\230\7\11\1\231\7\11\23\0"+
    "\22\11\1\0\2\11\1\0\17\11\1\232\1\11\23\0"+
    "\22\11\1\0\2\11\1\0\11\11\1\233\7\11\23\0"+
    "\15\11\1\234\4\11\1\0\2\11\1\0\5\11\1\235"+
    "\13\11\23\0\22\11\1\0\2\11\1\0\5\11\1\236"+
    "\13\11\23\0\22\11\1\0\2\11\1\0\5\11\1\237"+
    "\13\11\23\0\22\11\1\0\2\11\1\0\11\11\1\240"+
    "\7\11\23\0\15\11\1\241\4\11\1\0\2\11\1\0"+
    "\21\11\23\0\15\11\1\242\4\11\1\0\2\11\1\0"+
    "\11\11\1\243\7\11\23\0\22\11\1\0\2\11\1\0"+
    "\1\11\1\244\17\11\14\0\2\143\1\144\67\143\2\146"+
    "\1\144\67\146\2\0\1\151\67\0\5\152\1\245\64\152"+
    "\4\0\1\151\1\153\132\0\1\246\53\0\1\247\106\0"+
    "\1\250\52\0\1\54\104\0\1\250\4\0\1\251\61\0"+
    "\1\252\63\0\1\253\71\0\1\247\14\0\1\155\43\0"+
    "\1\254\126\0\1\255\54\0\1\256\44\0\1\167\1\0"+
    "\1\167\4\0\1\167\4\0\3\65\53\0\1\167\1\0"+
    "\1\167\4\0\1\167\56\0\1\52\1\0\1\52\1\0"+
    "\1\171\1\52\1\171\1\0\1\52\1\0\1\52\1\171"+
    "\1\0\1\52\1\0\1\52\1\65\1\66\1\65\2\0"+
    "\1\52\45\0\22\11\1\0\1\133\1\11\1\0\21\11"+
    "\23\0\10\11\1\257\11\11\1\0\2\11\1\0\21\11"+
    "\23\0\22\11\1\0\2\11\1\0\1\11\1\235\17\11"+
    "\23\0\22\11\1\0\2\11\1\0\4\11\1\260\1\261"+
    "\13\11\23\0\21\11\1\133\1\0\2\11\1\0\21\11"+
    "\23\0\22\11\1\0\2\11\1\0\10\11\1\262\10\11"+
    "\23\0\22\11\1\0\2\11\1\0\11\11\1\263\7\11"+
    "\23\0\22\11\1\0\2\11\1\0\7\11\1\264\11\11"+
    "\23\0\22\11\1\0\2\11\1\0\12\11\1\235\6\11"+
    "\23\0\22\11\1\0\2\11\1\0\2\11\1\260\16\11"+
    "\23\0\22\11\1\0\2\11\1\0\4\11\1\227\14\11"+
    "\23\0\22\11\1\0\2\11\1\0\2\11\1\265\16\11"+
    "\23\0\22\11\1\0\2\11\1\0\1\266\20\11\23\0"+
    "\22\11\1\0\1\267\1\11\1\0\21\11\23\0\22\11"+
    "\1\0\2\11\1\0\13\11\1\133\5\11\23\0\22\11"+
    "\1\0\2\11\1\0\2\11\1\270\16\11\23\0\15\11"+
    "\1\235\4\11\1\0\2\11\1\0\21\11\23\0\13\11"+
    "\1\271\6\11\1\0\2\11\1\0\21\11\23\0\22\11"+
    "\1\0\2\11\1\0\11\11\1\272\7\11\23\0\22\11"+
    "\1\0\1\273\1\11\1\0\21\11\23\0\15\11\1\274"+
    "\4\11\1\0\2\11\1\0\21\11\23\0\22\11\1\0"+
    "\1\275\1\11\1\0\21\11\23\0\13\11\1\276\6\11"+
    "\1\0\2\11\1\0\21\11\23\0\22\11\1\0\2\11"+
    "\1\0\5\11\1\277\13\11\23\0\22\11\1\0\2\11"+
    "\1\0\1\11\1\260\17\11\23\0\22\11\1\0\2\11"+
    "\1\0\10\11\1\300\10\11\23\0\22\11\1\0\1\301"+
    "\1\11\1\0\21\11\23\0\22\11\1\0\2\11\1\0"+
    "\5\11\1\173\13\11\23\0\22\11\1\0\2\11\1\0"+
    "\17\11\1\302\1\11\23\0\22\11\1\0\1\303\1\11"+
    "\1\0\21\11\23\0\22\11\1\0\1\304\1\11\1\0"+
    "\7\11\1\305\11\11\23\0\22\11\1\0\2\11\1\0"+
    "\4\11\1\133\14\11\23\0\22\11\1\0\1\306\1\11"+
    "\1\0\21\11\23\0\22\11\1\0\2\11\1\0\10\11"+
    "\1\307\10\11\23\0\22\11\1\0\2\11\1\0\11\11"+
    "\1\310\7\11\23\0\22\11\1\0\2\11\1\0\7\11"+
    "\1\133\11\11\23\0\22\11\1\0\2\11\1\0\2\11"+
    "\1\311\16\11\23\0\15\11\1\172\4\11\1\0\2\11"+
    "\1\0\21\11\23\0\13\11\1\172\6\11\1\0\2\11"+
    "\1\0\21\11\23\0\22\11\1\0\2\11\1\0\2\11"+
    "\1\312\16\11\23\0\21\11\1\235\1\0\2\11\1\0"+
    "\21\11\23\0\22\11\1\0\2\11\1\0\5\11\1\313"+
    "\13\11\14\0\4\152\1\151\1\245\64\152\45\0\1\314"+
    "\56\0\1\251\71\0\1\315\65\0\1\315\107\0\1\316"+
    "\73\0\1\251\47\0\1\317\111\0\1\320\74\0\1\321"+
    "\31\0\22\11\1\0\2\11\1\0\6\11\1\133\12\11"+
    "\23\0\22\11\1\0\2\11\1\0\5\11\1\235\13\11"+
    "\23\0\22\11\1\0\2\11\1\0\11\11\1\322\7\11"+
    "\23\0\22\11\1\0\2\11\1\0\12\11\1\133\6\11"+
    "\23\0\22\11\1\0\2\11\1\0\12\11\1\223\6\11"+
    "\23\0\22\11\1\0\2\11\1\0\10\11\1\235\10\11"+
    "\23\0\13\11\1\323\6\11\1\0\2\11\1\0\21\11"+
    "\23\0\15\11\1\324\4\11\1\0\2\11\1\0\21\11"+
    "\23\0\22\11\1\0\2\11\1\0\1\11\1\264\17\11"+
    "\23\0\22\11\1\0\2\11\1\0\3\11\1\133\15\11"+
    "\23\0\22\11\1\0\2\11\1\0\1\11\1\325\17\11"+
    "\23\0\22\11\1\0\2\11\1\0\4\11\1\326\14\11"+
    "\23\0\10\11\1\327\11\11\1\0\2\11\1\0\21\11"+
    "\23\0\22\11\1\0\1\176\1\11\1\0\21\11\23\0"+
    "\10\11\1\330\11\11\1\0\2\11\1\0\21\11\23\0"+
    "\10\11\1\260\11\11\1\0\2\11\1\0\21\11\23\0"+
    "\22\11\1\0\2\11\1\0\11\11\1\331\7\11\23\0"+
    "\22\11\1\0\1\243\1\11\1\0\21\11\23\0\22\11"+
    "\1\0\2\11\1\0\7\11\1\332\11\11\23\0\15\11"+
    "\1\333\4\11\1\0\2\11\1\0\21\11\23\0\22\11"+
    "\1\0\2\11\1\0\2\11\1\176\16\11\23\0\22\11"+
    "\1\0\2\11\1\0\16\11\1\133\2\11\23\0\21\11"+
    "\1\334\1\0\2\11\1\0\10\11\1\335\1\176\7\11"+
    "\23\0\15\11\1\234\4\11\1\0\2\11\1\0\21\11"+
    "\23\0\22\11\1\0\2\11\1\0\10\11\1\172\10\11"+
    "\23\0\22\11\1\0\2\11\1\0\1\240\20\11\23\0"+
    "\22\11\1\0\2\11\1\0\5\11\1\336\13\11\23\0"+
    "\13\11\1\337\6\11\1\0\2\11\1\0\21\11\63\0"+
    "\1\315\60\0\1\315\55\0\1\340\105\0\1\341\103\0"+
    "\1\342\30\0\22\11\1\0\2\11\1\0\10\11\1\241"+
    "\10\11\23\0\15\11\1\343\4\11\1\0\2\11\1\0"+
    "\21\11\23\0\22\11\1\0\1\235\1\11\1\0\21\11"+
    "\23\0\22\11\1\0\2\11\1\0\10\11\1\133\10\11"+
    "\23\0\22\11\1\0\2\11\1\0\5\11\1\344\13\11"+
    "\23\0\22\11\1\0\2\11\1\0\5\11\1\345\13\11"+
    "\23\0\22\11\1\0\2\11\1\0\2\11\1\346\16\11"+
    "\23\0\10\11\1\347\11\11\1\0\2\11\1\0\21\11"+
    "\23\0\17\11\1\133\2\11\1\0\2\11\1\0\21\11"+
    "\23\0\22\11\1\0\2\11\1\0\2\11\1\350\16\11"+
    "\23\0\22\11\1\0\1\332\1\11\1\0\21\11\23\0"+
    "\22\11\1\0\2\11\1\0\2\11\1\351\16\11\23\0"+
    "\22\11\1\0\2\11\1\0\11\11\1\266\7\11\23\0"+
    "\22\11\1\0\2\11\1\0\2\11\1\352\16\11\44\0"+
    "\1\250\103\0\1\315\66\0\1\315\41\0\22\11\1\0"+
    "\2\11\1\0\5\11\1\133\13\11\23\0\22\11\1\0"+
    "\1\174\1\11\1\0\21\11\23\0\22\11\1\0\2\11"+
    "\1\0\2\11\1\353\16\11\23\0\22\11\1\0\2\11"+
    "\1\0\4\11\1\343\14\11\23\0\1\11\1\275\20\11"+
    "\1\0\2\11\1\0\21\11\23\0\22\11\1\0\2\11"+
    "\1\0\5\11\1\172\13\11\23\0\22\11\1\0\2\11"+
    "\1\0\13\11\1\172\5\11\23\0\15\11\1\133\4\11"+
    "\1\0\2\11\1\0\21\11\23\0\22\11\1\0\2\11"+
    "\1\0\10\11\1\354\10\11\23\0\22\11\1\0\2\11"+
    "\1\0\14\11\1\133\4\11\14\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[12644];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\1\11\2\1\1\11\30\1\6\11"+
    "\3\1\1\0\1\1\6\0\4\1\1\11\2\1\1\0"+
    "\52\1\1\0\1\11\3\0\1\1\1\11\11\0\1\1"+
    "\3\0\1\1\1\0\54\1\12\0\35\1\1\0\1\11"+
    "\4\0\16\1\3\0\12\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[236];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /* user code: */

    public CLexer() {
        super();
    }

	private Token token(TokenType type) {
        return new Token(type, yychar, yylength());
    }
    
    private Token token(TokenType type, int pairValue) {
        return new Token(type, yychar, yylength(), (byte)pairValue);
    }

    private static final byte PARAN     = 1;
    private static final byte BRACKET   = 2;
    private static final byte CURLY     = 3;

    // These will be used to store Token Start positions and length for Complex 
    // Tokens that need deifferent Lexer States, like STRING
    int tokenStart;
    int tokenLength;



  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public CLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public CLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 2236) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzPushbackPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead < 0) {
      return true;
    }
    else {
      zzEndRead+= numRead;
      return false;
    }
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = zzPushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = zzLexicalState;


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 12: 
          { return token(TokenType.KEYWORD);
          }
        case 16: break;
        case 7: 
          { return token(TokenType.OPERATOR,  CURLY);
          }
        case 17: break;
        case 9: 
          { return token(TokenType.OPERATOR,  BRACKET);
          }
        case 18: break;
        case 3: 
          { return token(TokenType.OPERATOR);
          }
        case 19: break;
        case 6: 
          { return token(TokenType.OPERATOR, -PARAN);
          }
        case 20: break;
        case 14: 
          { return token(TokenType.KEYWORD2);
          }
        case 21: break;
        case 2: 
          { return token(TokenType.IDENTIFIER);
          }
        case 22: break;
        case 5: 
          { return token(TokenType.OPERATOR,  PARAN);
          }
        case 23: break;
        case 13: 
          { return token(TokenType.STRING);
          }
        case 24: break;
        case 11: 
          { return token(TokenType.COMMENT);
          }
        case 25: break;
        case 10: 
          { return token(TokenType.OPERATOR, -BRACKET);
          }
        case 26: break;
        case 8: 
          { return token(TokenType.OPERATOR, -CURLY);
          }
        case 27: break;
        case 15: 
          { return token(TokenType.TYPE);
          }
        case 28: break;
        case 4: 
          { return token(TokenType.NUMBER);
          }
        case 29: break;
        case 1: 
          { 
          }
        case 30: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
              {
                return null;
              }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
