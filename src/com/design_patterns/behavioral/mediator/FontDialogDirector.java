package com.design_patterns.behavioral.mediator;

public class FontDialogDirector extends DialogDirector {
    private ListBox fontList;
    private EntryField fontName;
    private Button okButton;

    public FontDialogDirector() {
        this.fontList = new ListBox(this);
        this.fontName = new EntryField(this);
        this.okButton = new Button(this);
    }

    public ListBox getFontList() {
        return fontList;
    }

    public Button getOkButton() {
        return okButton;
    }

    @Override
    public void showDialog() {
        System.out.println("Showing font dialog");
    }

    @Override
    public void widgetChanged(Widget widget) {
        if (widget == fontList) {
            fontName.setText(fontList.getSelection());
        } else if (widget == okButton) {
            System.out.println("Applying font: " + fontName.getText());
        }
    }
}
