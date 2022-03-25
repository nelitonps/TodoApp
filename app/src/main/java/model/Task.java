
package model;

import java.util.Date;

public class Task {
        private int id;
        private int idProjects;
        private String name;
        private String description;
        private String notes;
        private boolean Completed;
        private Date deadline;
        private Date createDat;
        private Date updateDat;

        public Task(int id, int idProjects, String name, String description, String notes, boolean Completed, Date deadline, Date createDat, Date updateDat) {
                this.id = id;
                this.idProjects = idProjects;
                this.name = name;
                this.description = description;
                this.notes = notes;
                this.Completed = Completed;
                this.deadline = deadline;
                this.createDat = createDat;
                this.updateDat = updateDat;
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public int getIdProjects() {
                return idProjects;
        }

        public void setIdProjects(int idProjects) {
                this.idProjects = idProjects;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public String getNotes() {
                return notes;
        }

        public void setNotes(String notes) {
                this.notes = notes;
        }

        public boolean isCompleted() {
                return Completed;
        }

        public void setCompleted(boolean Completed) {
                this.Completed = Completed;
        }

        public Date getDeadline() {
                return deadline;
        }

        public void setDeadline(Date deadline) {
                this.deadline = deadline;
        }

        public Date getCreateDat() {
                return createDat;
        }

        public void setCreateDat(Date createDat) {
                this.createDat = createDat;
        }

        public Date getUpdateDat() {
                return updateDat;
        }

        public void setUpdateDat(Date updateDat) {
                this.updateDat = updateDat;
        }

        @Override
        public String toString() {
                return "Task{" + "id=" + id + ", idProjects=" + idProjects + ", name=" + name + ", description=" + description + ", notes=" + notes + ", Completed=" + Completed + ", deadline=" + deadline + ", createDat=" + createDat + ", updateDat=" + updateDat + '}';
        }
}
