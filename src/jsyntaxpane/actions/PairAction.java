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
package jsyntaxpane.actions;

import jsyntaxpane.util.Configuration;

import javax.swing.text.JTextComponent;
import javax.swing.text.TextAction;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.util.Map;

/**
 * A Pair action inserts a pair of characters (left and right) around the
 * current selection, and then places the caret between them
 *
 * The pairs are hard-coded here.
 */
public class PairAction extends TextAction implements SyntaxAction {

    public PairAction() {
        super("PAIR_ACTION");
    }

    public void actionPerformed(ActionEvent e) {
        JTextComponent target = getTextComponent(e);
        if (target != null) {
            String left = e.getActionCommand();
            String right = PAIRS.get(left);
            String selected = target.getSelectedText();
            if (selected != null) {
                target.replaceSelection(left + selected + right);
            } else {
                target.replaceSelection(left + right);
            }
            target.setCaretPosition(target.getCaretPosition() - 1);
        }
    }

    public void config(Configuration config, String prefix, String name) {
    }

    public TextAction getAction(String key) {
        return this;
    }

    private static Map<String, String> PAIRS = new HashMap<String, String>(4);

    static {
        PAIRS.put("(", ")");
        PAIRS.put("[", "]");
        PAIRS.put("\"", "\"");
        PAIRS.put("'", "'");
    }
}
