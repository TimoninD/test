package com.github.timonind.test.services

import com.intellij.openapi.project.Project
import com.github.timonind.test.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
