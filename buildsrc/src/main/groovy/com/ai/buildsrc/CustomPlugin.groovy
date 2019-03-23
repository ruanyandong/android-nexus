package com.ai.buildsrc

import org.gradle.api.Plugin
import org.gradle.api.Project

class CustomPlugin implements Plugin<Project>{
    @Override
    void apply(Project project) {
        project.task('BuildSrcTask').doLast {
            println("这是自定义的gradle 插件")
        }
    }
}
