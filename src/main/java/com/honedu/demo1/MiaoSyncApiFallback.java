package com.honedu.demo1;

import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Service;

@Service
public class MiaoSyncApiFallback implements FallbackFactory<MiaoSyncApiFallback> {
    @Override
    public MiaoSyncApiFallback create(Throwable cause) {
        return null;
    }
}
