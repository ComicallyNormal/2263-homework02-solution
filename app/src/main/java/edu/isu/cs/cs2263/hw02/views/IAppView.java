package edu.isu.cs.cs2263.hw02.views;

import javafx.scene.Node;
import lombok.extern.log4j.Log4j2;

public interface IAppView {

    Node getView();

    void initView();

    void updateData();
}
