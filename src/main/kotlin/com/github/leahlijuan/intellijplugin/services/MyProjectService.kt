package com.github.leahlijuan.intellijplugin.services

import com.intellij.openapi.project.Project
import com.github.leahlijuan.intellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
