package com.rythmplugin.lexer;

import com.intellij.lexer.FlexAdapter;


import java.io.Reader;

/**
 * Created by mpl on 04.08.2016.
 */
public class RythmLexerAdapter extends FlexAdapter {
    public RythmLexerAdapter() {
        super(new RythmLexer((Reader) null));
    }
}
