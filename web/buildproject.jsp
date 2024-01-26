<%-- 
    Document   : buildproject.jsp
    Created on : Jan 25, 2024, 2:37:15 PM
    Author     : VanHuy
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp" />
<<main>
    <div class="container">
      <h1>Create a Project</h1>
      <form action="/submit-post" method="post">
        <div class="mb-3">
          <label for="post-title" class="form-label">Title</label>
          <input
            type="text"
            class="form-control"
            id="post-title"
            name="title"
            required
          />
        </div>
        <div class="mb-3">
          <label for="post-content" class="form-label">Content</label>
          <textarea
            class="form-control"
            id="post-content"
            name="content"
            rows="10"
            required
          ></textarea>
        </div>
        <div class="mb-3">
          <label for="post-description" class="form-label"
            >Description (Optional)</label
          >
          <textarea
            class="form-control"
            id="post-description"
            name="description"
            rows="3"
          ></textarea>
        </div>
        <div class="mb-3">
          <label for="post-category" class="form-label">Category</label>
          <select
            class="form-select"
            id="post-category"
            name="category"
            required
          >
            <option value="">Select a Category</option>
            <option value="news">News</option>
            <option value="technology">Technology</option>
            <option value="travel">Travel</option>
            <option value="lifestyle">Lifestyle</option>
          </select>
        </div>
        <button type="submit" class="btn btn-primary">Start</button>
      </form>
    </div>

    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-MhqjwqK/bNCSA/WqAX+uHacUonVujUUN6q6qC8J7jAK/uX4nuxL46k1KpaS"
      crossorigin="anonymous"
    ></script>
</main>
<jsp:include page="footer.jsp" />