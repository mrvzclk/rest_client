package com.client;

import org.gitlab4j.api.GitLabApi;
import org.gitlab4j.api.GitLabApiException;
import org.gitlab4j.api.models.Project;

import java.util.List;

public class Gitlab {

   GitLabApi gitLabApi = new GitLabApi("https://gitlab.testinium.io", "YOUR_ACCESS_TOKEN");
     {
        try {
            gitLabApi = GitLabApi.login("https://gitlab.testinium.io", "your-username", "your-password");
        } catch (GitLabApiException e) {
            e.printStackTrace();
        }
    }

}
