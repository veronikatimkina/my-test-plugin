package com.github.veronikatimkina.mytestplugin.services

import com.intellij.openapi.project.Project
import com.github.veronikatimkina.mytestplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
