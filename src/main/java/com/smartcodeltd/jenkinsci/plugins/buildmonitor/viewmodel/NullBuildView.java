package com.smartcodeltd.jenkinsci.plugins.buildmonitor.viewmodel;

import hudson.model.Result;

import java.util.HashSet;
import java.util.Set;

public class NullBuildView implements BuildViewModel {

    @Override
    public String name() {
        return "";
    }

    @Override
    public String url() {
        return "";
    }

    @Override
    public Result result() {
        return Result.NOT_BUILT;
    }

    @Override
    public boolean isRunning() {
        return false;
    }

    @Override
    public Duration elapsedTime() {
        return null;
    }

    @Override
    public Duration duration() {
        return null;
    }

    @Override
    public Duration estimatedDuration() {
        return null;
    }

    @Override
    public int progress() {
        return 0;
    }
       
    @Override
    public int testTotalCount() {
        return 0;
    }

    @Override
    public int testFailCount() {
        return 0;
    }

    @Override
    public int testSkipCount() {
        return 0;
    }
    
    @Override
    public boolean isRobotBuild(){
        return false;
    }

    @Override
    public boolean hasPreviousBuild() {
        return false;
    }

    @Override
    public BuildViewModel previousBuild() {
        return null;
    }

    @Override
    public Set<String> culprits() {
        return new HashSet<String>();
    }

    @Override
    public boolean isClaimed() {
        return false;
    }

    @Override
    public String claimant() {
        return null;
    }

    @Override
    public String reasonForClaim() {
        return null;
    }
}
