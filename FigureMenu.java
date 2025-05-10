menu.add(new JMenuItem(new AbstractAction("Move Hexagon") {
    public void actionPerformed(ActionEvent e) {
        MoveHexagonAction action = new MoveHexagonAction(selectedHexagon, 10, 0);
        action.perform();
    }
}));

menu.add(new JMenuItem(new AbstractAction("Change Hexagon Color") {
    public void actionPerformed(ActionEvent e) {
        ChangeHexagonColorAction action = new ChangeHexagonColorAction(selectedHexagon, Color.BLUE);
        action.perform();
    }
}));
