package com.armxyitao.eyepetizer;

import com.github.moduth.blockcanary.BlockCanaryContext;

/**
 * @author 熊亦涛
 * @time 16/7/26  16:48
 * @desc ${TODD}
 */
public class AppBlockCanaryContext extends BlockCanaryContext {
    // override to provide context like app qualifier, uid, network type, block threshold, log save path

    // this is default block threshold, you can set it by phone's performance
    @Override
    public int getConfigBlockThreshold() {
        return 500;
    }

    // if set true, notification will be shown, else only write log file
    @Override
    public boolean isNeedDisplay() {
        return true;
    }

    // path to save log file
    @Override
    public String getLogPath() {
        return "/blockcanary/performance";
    }
}
