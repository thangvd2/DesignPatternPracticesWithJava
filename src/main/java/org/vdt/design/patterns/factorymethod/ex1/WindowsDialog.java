package org.vdt.design.patterns.factorymethod.ex1;

/**
 * @Author Admin
 * @create 14/03/2021 23:38
 */
public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
