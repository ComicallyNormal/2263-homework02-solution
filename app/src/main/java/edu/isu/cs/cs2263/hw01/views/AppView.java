package edu.isu.cs.cs2263.hw01.views;

import edu.isu.cs.cs2263.hw01.App;
import javafx.scene.Node;

public abstract class AppView implements IAppView {

    protected Node view;
    protected App parent;

    public AppView(App parent) {
        this.parent = parent;
        initView();
    }

    public Node getView() {
        return view;
    }
}
