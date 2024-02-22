<%-- 
    Document   : projectdonationlist
    Created on : Jan 30, 2024, 1:15:47 PM
    Author     : VanHuy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp" />
<<main>
    <div class="container">
        <h1>Update Project Process : Project Name</h1>


        <form action="addpp" method="post" enctype="multipart/form-data">
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
                    name="planOfPhase"
                    required
                    />
            </div>
            <div class="mb-3">
                <label for="post-title" class="form-label">Money Cost</label>
                <input
                    type="text"
                    class="form-control"
                    id="post-title"
                    name="moneyCost"
                    required
                    />
            </div>

            <div class="mb-3">
                <label for="post-content" class="form-label">Description</label>
                <textarea
                    class="form-control"
                    id="post-content"
                    name="discription"
                    rows="10"
                    required
                    ></textarea>
            </div>
            <div>
                <label>Image</label><br /> <input type="file" name="files">
            </div>
            <div>
                <button
                    type="submit"
                    class="btn btn-primary"
                    style="border-radius: 25px; margin-top: 15px"
                    >
                    Update
                </button>
            </div>
        </form>
        <%
            String msg = (String) session.getAttribute("msg");
            if (msg != null) {
        %>
        <h4 class="text-center text-success"><%=msg%></h4>
        <%
                session.removeAttribute("msg");
            }
        %>
    </div>
</main>
<jsp:include page="footer.jsp" />