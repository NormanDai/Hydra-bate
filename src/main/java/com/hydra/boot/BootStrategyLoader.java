package com.hydra.boot;


public class BootStrategyLoader {

    private SystemBootstrap bootstrap;

    public BootStrategyLoader(SystemBootstrap bootstrap){
        this.bootstrap = bootstrap;
    }

    public void load(){
        bootstrap.initialize();
        bootstrap.bootStart();
    }

    public void unload(){
        bootstrap.destroy();
    }

}
