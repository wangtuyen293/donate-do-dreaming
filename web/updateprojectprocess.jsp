<%-- 
    Document   : projectdonationlist
    Created on : Jan 30, 2024, 1:15:47 PM
    Author     : VanHuy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp" />
<<main>
    <div class="container">
      <h1>Create a Project</h1>
      <form action="/submit-post" method="post">
        <div class="mb-3">
          <label for="post-date" class="form-label">Date</label>
          <input
            type="date"
            class="form-control"
            id="post-date"
            name="date"
            required
          />
        </div>
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

        <button
          type="submit"
          class="btn btn-primary"
          style="border-radius: 25px; margin-top: 15px"
        >
          Update
        </button>
      </form>
    </div>
</main>
<jsp:include page="footer.jsp" />